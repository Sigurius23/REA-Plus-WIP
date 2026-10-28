.class public final Lg40/o2;
.super Lg40/p2;
.source "SourceFile"


# static fields
.field public static final d:Lg40/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg40/o2;

    new-instance v1, Lyb3/p;

    const-string v2, "\\d+"

    invoke-direct {v1, v2}, Lyb3/p;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-direct {v0, v2, v2, v1}, Lg40/p2;-><init>(IILyb3/p;)V

    sput-object v0, Lg40/o2;->d:Lg40/o2;

    return-void
.end method
