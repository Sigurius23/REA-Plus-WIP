.class public abstract Llc3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhc3/x;

.field public static final b:Lhc3/x;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;

.field public static final e:Lhc3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhc3/x;

    const-string v1, "STATE_REG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/i;->a:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/i;->b:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/i;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "NO_RESULT"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/i;->d:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "PARAM_CLAUSE_0"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/i;->e:Lhc3/x;

    return-void
.end method

.method public static final a(Llc3/f;JLkotlin/jvm/functions/Function1;)V
    .locals 8

    new-instance v2, Llc3/b;

    invoke-direct {v2, p1, p2}, Llc3/b;-><init>(J)V

    sget-object v3, Llc3/a;->w:Llc3/a;

    const/4 p1, 0x3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    new-instance v0, Llc3/d;

    sget-object v5, Llc3/i;->e:Lhc3/x;

    move-object v6, p3

    check-cast v6, Ls83/i;

    sget-object v4, Llc3/h;->w:Llc3/h;

    const/4 v7, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Llc3/d;-><init>(Llc3/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lhc3/x;Ls83/i;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 p0, 0x0

    invoke-virtual {v1, v0, p0}, Llc3/f;->f(Llc3/d;Z)V

    return-void
.end method
