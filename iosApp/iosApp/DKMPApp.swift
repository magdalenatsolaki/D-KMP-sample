//
//  DKMPApp.swift
//
//  Created by Daniele Baroncelli on 13/03/2021.
//
//

import SwiftUI
import shared

@main
struct iosApp: App {
    @StateObject var appObj = AppObservableObject()
    @Environment(\.scenePhase) var scenePhase
    var body: some Scene {
        WindowGroup {
            MainView(appObj: appObj)
                .onChange(of: scenePhase) { newPhase in
                    if newPhase == .active {
                        appObj.dkmpNav.onReEnterForeground()
                    }
                    else if newPhase == .background {
                        appObj.dkmpNav.onEnterBackground()
                    }
                }
        }
    }
}
