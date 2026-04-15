# Data Collector

A Java-based admission record management system that lets you collect, store, edit, and export student admission data — built for simplicity and offline use.

## What does it do?

Managing admission records manually is a pain. Data Collector provides a structured interface to input student details, save them persistently, and export the data in multiple formats for further use — all without needing an internet connection or a database server.

## Features

- Add, view, edit, and delete admission records
- Persistent local storage via `.txt` file
- Export data to `.xlsx` (Excel) format for reporting
- Clean Java GUI for easy data entry
- Lightweight — runs fully offline

## Tech Stack

- **Language:** Java
- **Storage:** Local file system (`.txt`, `.xlsx`)
- **IDE:** Eclipse

## Getting Started

### Prerequisites

- Java JDK 8 or above
- Eclipse or any Java IDE

### Run

1. Clone the repository
   ```
   git clone https://github.com/saptarshiroy2007-sketch/Data_Collector.git
   ```
2. Open in Eclipse
3. Run the main class inside `src/helens/`

## File Structure

```
Data_Collector/
├── src/helens/         # Source files
├── bin/helens/         # Compiled classes
├── data.txt            # Stored admission records
├── data.xslx           # Exported Excel data
└── README.md
```

## Roadmap

- [ ] Search and filter records
- [ ] PDF export support
- [ ] Database backend (SQLite) for better scalability
- [ ] Print-ready report generation

## Author

**Saptarshi Roy** — [GitHub](https://github.com/saptarshiroy2007-sketch)
