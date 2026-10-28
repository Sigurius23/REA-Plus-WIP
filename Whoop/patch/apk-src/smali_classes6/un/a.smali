.class public abstract Lun/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/a0;


# instance fields
.field public final a:J

.field public final b:Lko/n;

.field public final c:I

.field public final d:Lrm/c0;

.field public final e:I

.field public final f:Ljava/lang/Object;

.field public final g:J

.field public final h:J

.field public final i:Lko/i0;


# direct methods
.method public constructor <init>(Lko/l;Lko/n;ILrm/c0;ILjava/lang/Object;JJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lko/i0;

    invoke-direct {v0, p1}, Lko/i0;-><init>(Lko/l;)V

    iput-object v0, p0, Lun/a;->i:Lko/i0;

    iput-object p2, p0, Lun/a;->b:Lko/n;

    iput p3, p0, Lun/a;->c:I

    iput-object p4, p0, Lun/a;->d:Lrm/c0;

    iput p5, p0, Lun/a;->e:I

    iput-object p6, p0, Lun/a;->f:Ljava/lang/Object;

    iput-wide p7, p0, Lun/a;->g:J

    iput-wide p9, p0, Lun/a;->h:J

    sget-object p1, Lsn/m;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p1

    iput-wide p1, p0, Lun/a;->a:J

    return-void
.end method
