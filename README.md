📂 FileOrganizerMaster
Organization, Mastered. A modular, high-performance Java utility to "stitch" your disorganized directories into a structured ecosystem.

🚀 The Vision
FileOrganizerMaster is designed for users who are tired of a cluttered Downloads folder but wary of "black-box" cleaning tools. Built with a Google Stitch Studio aesthetic in mind, it provides a clean, modular, and safe way to categorize files dynamically.

🛠️ Features
Dynamic Path Selection: Choose any directory to organize via a native UI folder picker.

Lazy Folder Creation: Folders are created only if a matching file type is detected—keeping your storage clean.

Conflict Resolution: Never worry about losing data. If resume.pdf exists, the tool automatically renames the new file to resume (1).pdf.

Developer-Friendly Modularity: Cleanly separated logic across four core modules for easy scaling and testing.

🏗️ Architecture (Developer's Corner)
The project is built on a Modular Logic Pattern to ensure high cohesion and low coupling.

Core Components:
PathPicker: Handles the UI interaction using JFileChooser.

OrganizerLogic: The "brain" that streams files and decides their destination.

ExtensionConfig: A centralized mapping system for file types.

FileUtils: Utility methods for extension extraction and naming conflict resolution.

🛡️ Safety & Transparency
We believe in Zero-Inference Security:

100% Offline: This application does not have internet permissions. Your file paths and names never leave your machine.

Open Logic: Every line of code is open for review.

Non-Destructive: The tool uses Files.move() with a conflict checker. It will never overwrite or delete your original files.

📥 Installation & Usage
Download: Grab the latest FileOrganizerMaster.jar from the Releases section.

Run: ```bash
java -jar FileOrganizerMaster.jar

Select: Choose the folder you want to organize.

Done: Your files are now neatly categorized inside a FilesDrawer folder.

🌟 Support & Community
🗳️ Vote for Features
I’m constantly adding new modules. What should come next?

[ ] Duplicate File Finder (Deep scan for identical files)

[ ] Cloud-Sync Integration (Google Drive/Dropbox)

[ ] Custom Extension Mapping (Define your own folders)

☕ Help the Creator
If this tool saved you time, consider fueling the next update:

