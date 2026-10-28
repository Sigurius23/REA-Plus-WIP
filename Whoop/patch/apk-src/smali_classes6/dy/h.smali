.class public abstract Ldy/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcy/b;

.field public static final b:Lcy/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lcy/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ldy/h;->a:Lcy/b;

    new-instance v0, Lcy/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ldy/h;->b:Lcy/b;

    return-void
.end method
