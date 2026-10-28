.class public final enum Lbz/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic y:[Lbz/g;

.field public static final synthetic z:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lbz/g;

    const-string v1, "com.facebook.react.bridge.NativeModule"

    const-string v2, "react-native"

    const-string v3, "ReactNative"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lbz/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lbz/g;

    const-string v2, "io.flutter.embedding.engine.FlutterEngine"

    const-string v3, "flutter"

    const-string v4, "Flutter"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Lbz/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lbz/g;

    const-string v3, "org.apache.cordova.CordovaActivity"

    const-string v4, "cordova"

    const-string v5, "Cordova"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3, v4}, Lbz/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lbz/g;

    const-string v4, "com.unity3d.player.UnityPlayerActivity"

    const-string v5, "unity"

    const-string v6, "Unity"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4, v5}, Lbz/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, v1, v2, v3}, [Lbz/g;

    move-result-object v0

    sput-object v0, Lbz/g;->y:[Lbz/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lbz/g;->z:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbz/g;->w:Ljava/lang/String;

    iput-object p4, p0, Lbz/g;->x:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbz/g;
    .locals 1

    const-class v0, Lbz/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbz/g;

    return-object p0
.end method

.method public static values()[Lbz/g;
    .locals 1

    sget-object v0, Lbz/g;->y:[Lbz/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbz/g;

    return-object v0
.end method
