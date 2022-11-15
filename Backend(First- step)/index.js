import express from 'express';
import mongoose from 'mongoose'
import router from "./router.js"

const PORT = 5000;
const app = express();


const DB_URL = `mongodb+srv://admin:admin@cluster0.s9ohoib.mongodb.net/?retryWrites=true&w=majority`

app.use(express.json())
app.use('/api', router)

async function startApp() {
    try {
        await mongoose.connect(DB_URL);
        app.listen(PORT, ()=> console.log(`Server Started, port:${PORT}`))
    }catch (e){
        console.log(e)
    }
}

startApp()
