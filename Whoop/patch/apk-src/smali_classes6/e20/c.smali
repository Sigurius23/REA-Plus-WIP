.class public abstract Le20/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcy/b;

.field public static final b:Lcy/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lcy/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Le20/c;->a:Lcy/b;

    new-instance v0, Lcy/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Le20/c;->b:Lcy/b;

    return-void
.end method
