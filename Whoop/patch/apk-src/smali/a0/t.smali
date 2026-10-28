.class public abstract La0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La0/g0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/g0;-><init>(I)V

    sput-object v0, La0/t;->a:La0/g0;

    return-void
.end method

.method public static final a()La0/g0;
    .locals 1

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    return-object v0
.end method
