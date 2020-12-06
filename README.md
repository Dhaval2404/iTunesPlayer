<h1 align="center">iTunes Player</h1>

<p align="center">  

[![Releases](https://img.shields.io/github/release/dhaval2404/iTunesPlayer/all.svg?style=flat-square)](https://github.com/Dhaval2404/iTunesPlayer/releases)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![PRWelcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/Dhaval2404/iTunesPlayer)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/Dhaval2404/iTunesPlayer/blob/master/LICENSE)
</p>

<p align="center">  
🎵 Android iTunes Player Kotlin, Coroutines, Jetpack (Room, ViewModel, LiveData) based on MVVM architecture.
</p>
</br>

<p align="center">
<img src="https://github.com/Dhaval2404/iTunesPlayer/blob/master/art/preview.png"/>
</p>

## Tech stack & Open-source libraries
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- [Koin](https://insert-koin.io/) for dependency injection.
- JetPack
  - LiveData - notify domain layer data to views.
  - ViewModel - UI related data holder, lifecycle aware.
  - Room Persistence - construct a database using the abstract layer.
- Architecture
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
  - Repository pattern
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct the REST APIs and Fetch network data.
- [Chucker](https://github.com/ChuckerTeam/chucker) - HTTP inspector.
- [SimpleXML](http://simple.sourceforge.net/) - A XML library for Java.
- [Coil](https://github.com/coil-kt/coil) - loading images.
- [logger](https://github.com/orhanobut/logger) - logging.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components like cardView.
- [Lottie](https://github.com/airbnb/lottie-android) - Splash Animation

## Credit

* Splash Logo</br>
	Auther: Tanvi Sharma</br>
	Source: https://lottiefiles.com/21882-speaker-music-sound

* Open API</br>
	Provider: iTunes Store - Top Songs</br>
	Source: http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topsongs/xml

### Let us know!

We'll be really happy if you sent us links to your projects where you use our component. Just send an email to **dhavalpatel244@gmail.com** And do let us know if you have any questions or suggestion regarding the library.

## License

    Copyright 2020, Dhaval Patel

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
