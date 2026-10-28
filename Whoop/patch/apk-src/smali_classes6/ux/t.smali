.class public final Lux/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lux/t;


# instance fields
.field public final a:Lux/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm30/h;

    invoke-direct {v0}, Lm30/h;-><init>()V

    new-instance v1, Lux/s;

    invoke-direct {v1, v0}, Lux/s;-><init>(Lm30/h;)V

    new-instance v0, Lux/r;

    const/4 v2, 0x5

    invoke-direct {v0, v2, v1}, Lux/r;-><init>(ILux/s;)V

    new-instance v1, Lux/t;

    invoke-direct {v1, v0}, Lux/t;-><init>(Lux/r;)V

    sput-object v1, Lux/t;->b:Lux/t;

    return-void
.end method

.method public constructor <init>(Lux/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux/t;->a:Lux/r;

    return-void
.end method
