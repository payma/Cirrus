/**
 *   ownCloud Android client application
 *
 *   Copyright (C) 2012 Bartek Przybylski
 *   Copyright (C) 2015 ownCloud Inc.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2,
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.synox.android.ui.activity;

import com.synox.android.datamodel.FileDataStorageManager;
import com.synox.android.files.FileOperationsHelper;
import com.synox.android.files.services.FileDownloader.FileDownloaderBinder;
import com.synox.android.files.services.FileUploader.FileUploaderBinder;
import com.synox.android.services.OperationsService.OperationsServiceBinder;

public interface ComponentsGetter {

    /**
     * To be invoked when the parent activity is fully created to get a reference  to the FileDownloader service API.
     */
    FileDownloaderBinder getFileDownloaderBinder();

    
    /**
     * To be invoked when the parent activity is fully created to get a reference to the FileUploader service API.
     */
    FileUploaderBinder getFileUploaderBinder();

    
    /**
     * To be invoked when the parent activity is fully created to get a reference to the OperationsSerivce service API.
     */
    OperationsServiceBinder getOperationsServiceBinder();

    
    FileDataStorageManager getStorageManager();
    
    FileOperationsHelper getFileOperationsHelper();


}
