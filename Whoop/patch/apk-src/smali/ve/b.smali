.class public final Lve/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# static fields
.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic E:I

.field public final w:Lve/g;

.field public final x:J

.field public final y:Lug/a;

.field public final z:Lvg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lve/b;

    const-string v1, "E"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lve/b;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lve/g;)V
    .locals 5

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/16 v1, 0x384

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    const/16 v3, 0xa

    invoke-static {v3, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v3

    sget-object v0, Lug/a;->a:Lug/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/b;->w:Lve/g;

    iput-wide v1, p0, Lve/b;->x:J

    iput-object v0, p0, Lve/b;->y:Lug/a;

    new-instance p1, Lvg/c;

    invoke-direct {p1, v3, v4, v0}, Lvg/c;-><init>(JLug/a;)V

    iput-object p1, p0, Lve/b;->z:Lvg/c;

    const/4 p1, 0x0

    iput p1, p0, Lve/b;->E:I

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lve/b;->E:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lve/b;->z:Lvg/c;

    new-instance v1, La33/c;

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-direct {v1, p0, p1, v2, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v1, p2}, Lvg/c;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Credentials provider is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Lve/b;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lve/b;->z:Lvg/c;

    invoke-virtual {v0}, Lvg/c;->close()V

    iget-object v0, p0, Lve/b;->w:Lve/g;

    invoke-static {v0}, Lyf/j;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lve/b;->w:Lve/g;

    invoke-static {v1}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
