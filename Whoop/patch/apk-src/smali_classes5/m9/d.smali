.class public abstract Lm9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/i;


# instance fields
.field public final E:I

.field public final F:Ljava/lang/Object;

.field public final G:J

.field public final H:J

.field public final I:Lz8/m;

.field public final w:J

.field public final x:Lz8/g;

.field public final y:I

.field public final z:Lu8/p;


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;ILu8/p;ILjava/lang/Object;JJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz8/m;

    invoke-direct {v0, p1}, Lz8/m;-><init>(Lz8/f;)V

    iput-object v0, p0, Lm9/d;->I:Lz8/m;

    iput-object p2, p0, Lm9/d;->x:Lz8/g;

    iput p3, p0, Lm9/d;->y:I

    iput-object p4, p0, Lm9/d;->z:Lu8/p;

    iput p5, p0, Lm9/d;->E:I

    iput-object p6, p0, Lm9/d;->F:Ljava/lang/Object;

    iput-wide p7, p0, Lm9/d;->G:J

    iput-wide p9, p0, Lm9/d;->H:J

    sget-object p1, Ll9/t;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p1

    iput-wide p1, p0, Lm9/d;->w:J

    return-void
.end method
