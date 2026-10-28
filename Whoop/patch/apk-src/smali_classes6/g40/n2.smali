.class public final Lg40/n2;
.super Lg40/p2;
.source "SourceFile"


# static fields
.field public static final d:Lg40/n2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg40/n2;

    new-instance v1, Lyb3/p;

    const-string v2, ".*"

    invoke-direct {v1, v2}, Lyb3/p;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    const v3, 0x7fffffff

    invoke-direct {v0, v2, v3, v1}, Lg40/p2;-><init>(IILyb3/p;)V

    sput-object v0, Lg40/n2;->d:Lg40/n2;

    return-void
.end method
