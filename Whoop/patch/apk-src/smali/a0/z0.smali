.class public abstract La0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La0/m0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/m0;-><init>(I)V

    sput-object v0, La0/z0;->a:La0/m0;

    return-void
.end method

.method public static final a()La0/m0;
    .locals 1

    new-instance v0, La0/m0;

    invoke-direct {v0}, La0/m0;-><init>()V

    return-object v0
.end method
