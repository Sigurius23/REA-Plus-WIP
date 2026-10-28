.class public final Lt9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lt9/s;->a:J

    return-void
.end method


# virtual methods
.method public a()Lu8/s;
    .locals 1

    new-instance v0, Lu8/s;

    invoke-direct {v0, p0}, Lu8/r;-><init>(Lt9/s;)V

    return-object v0
.end method
