.class public abstract Ln20/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcy/b;

.field public static final b:Lcy/b;

.field public static final c:Lcy/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lcy/b;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ln20/r;->a:Lcy/b;

    new-instance v0, Lcy/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ln20/r;->b:Lcy/b;

    new-instance v0, Lcy/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ln20/r;->c:Lcy/b;

    return-void
.end method
