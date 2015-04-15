Setup:
1. Download the folder Gflow
2. Download the Gflow summarizer form http://knowitall.cs.washington.edu/gflow/ site, add the below files and folders from the downloaded folder to Gflow folder:
src
bin
data
annotators.txt
preprocessing.py

3.Download the following dependencies:

WordNet:
http://wordnetcode.princeton.edu/wn3.1.dict.tar.gz

WordNet accessor:
From http://lyle.smu.edu/~tspell/jaws/:
jaws-bin.jar

Stanford CoreNLP:
From http://nlp.stanford.edu/software/corenlp.shtml#Download:
Stanford CoreNLP version 3.4.1

Ollie:
From http://knowitall.github.io/ollie/:
ollie-app-latest.jar

Weka:
From http://www.cs.waikato.ac.nz/ml/weka/downloading.html:
weka.jar 

engmalt.linear-1.7.mco
From the GIT folder provided.

4. Keep all of the downloaded dependencies (unzipped folders) in Gflow folder.
-----------------------------------------------------
Steps for running the GFlow summarizer:
1. Create a folder "data1" inside data/gflowExamples/. in "data1/" create "original" folder. 

2. Put the documents to run in data/gflowExamples/data1/original folder.
Note that each news file should have the same format as those in gflow-2014-9-17/data/gflowExamples/ukrainePlaneCrash/original/ and gflow-2014-9-17/data/gflowExamples/malaysiaPlane/original/.

3. Go to the Gflow folder from command prompt

4. Make the run.sh executable using below command.
   chmod +x run.sh

5. Now run the script using below command
   bash run.sh
