.class public final Lo0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj21/d;

.field public b:J

.field public c:F

.field public d:Ld1/j;


# direct methods
.method public constructor <init>(Lj21/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/d;->a:Lj21/d;

    const/4 p1, 0x0

    const/16 v0, 0xf

    invoke-static {p1, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    iput-wide v0, p0, Lo0/d;->b:J

    return-void
.end method
