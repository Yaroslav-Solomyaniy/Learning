using System;
using System.Net;
using static System.Net.Mime.MediaTypeNames;

namespace Ex_7_Practice10
{
    class Program
    {
        static void Main(string[] args)
        {
            string remoteUri = "http://www.contoso.com/library/homepage/images/";
            string fileName = "ms-banner.gif", myStringWebResource = null;
            // Create a new WebClient instance.
            WebClient myWebClient = new WebClient();
            // Concatenate the domain with the Web resource filename.
            myStringWebResource = remoteUri + fileName;
            Console.WriteLine("Downloading File \"{0}\" from \"{1}\" .......\n\n", fileName, myStringWebResource);
            // Download the Web resource and save it into the current filesystem folder.
            myWebClient.DownloadFile(myStringWebResource, fileName);
            Console.WriteLine("Successfully Downloaded File \"{0}\" from \"{1}\"", fileName, myStringWebResource);
        }
    }
}
