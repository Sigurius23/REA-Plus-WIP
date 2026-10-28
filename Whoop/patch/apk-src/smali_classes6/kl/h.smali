.class public abstract Lkl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwk/g;

.field public static final b:Lwk/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    sget-object v1, Lwk/b;->y:Lwk/b;

    invoke-static {v1, v0}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lkl/h;->a:Lwk/g;

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lkl/h;->b:Lwk/g;

    return-void
.end method
