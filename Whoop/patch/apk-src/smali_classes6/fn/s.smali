.class public final Lfn/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfn/h;

.field public final b:Llo/x;

.field public final c:Llo/s;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J


# direct methods
.method public constructor <init>(Lfn/h;Llo/x;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/s;->a:Lfn/h;

    iput-object p2, p0, Lfn/s;->b:Llo/x;

    new-instance p1, Llo/s;

    const/16 p2, 0x40

    new-array v0, p2, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v0, p2, v1, v2}, Llo/s;-><init>([BIIB)V

    iput-object p1, p0, Lfn/s;->c:Llo/s;

    return-void
.end method
