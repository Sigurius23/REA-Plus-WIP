.class public final Lab/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lab/j;

.field public final b:Lx8/s;

.field public final c:Llo/s;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J


# direct methods
.method public constructor <init>(Lab/j;Lx8/s;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/c0;->a:Lab/j;

    iput-object p2, p0, Lab/c0;->b:Lx8/s;

    new-instance p1, Llo/s;

    const/16 p2, 0x40

    new-array v0, p2, [B

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {p1, v0, p2, v1, v2}, Llo/s;-><init>([BIIB)V

    iput-object p1, p0, Lab/c0;->c:Llo/s;

    return-void
.end method
