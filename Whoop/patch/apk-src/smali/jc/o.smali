.class public final Ljc/o;
.super Landroidx/room/c1;
.source "SourceFile"


# static fields
.field public static final i:Ljava/lang/String;


# instance fields
.field public final a:Ljc/v;

.field public final b:Ljava/lang/String;

.field public final c:Lic/l;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Z

.field public h:Lic/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkContinuationImpl"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc/o;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/o;->a:Ljc/v;

    iput-object p2, p0, Ljc/o;->b:Ljava/lang/String;

    iput-object p3, p0, Ljc/o;->c:Lic/l;

    iput-object p4, p0, Ljc/o;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ljc/o;->e:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ljc/o;->f:Ljava/util/ArrayList;

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    sget-object p2, Lic/l;->w:Lic/l;

    if-ne p3, p2, :cond_1

    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lic/r0;

    iget-object p2, p2, Lic/r0;->b:Lqc/q;

    iget-wide v0, p2, Lqc/q;->u:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lic/r0;

    iget-object p2, p2, Lic/r0;->a:Ljava/util/UUID;

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p5, "toString(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p5, p0, Ljc/o;->e:Ljava/util/ArrayList;

    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p5, p0, Ljc/o;->f:Ljava/util/ArrayList;

    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static V(Ljc/o;)Ljava/util/HashSet;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public final U()Lic/e0;
    .locals 5

    iget-boolean v0, p0, Ljc/o;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ljc/o;->a:Ljc/v;

    iget-object v1, v0, Ljc/v;->b:Lic/b;

    iget-object v1, v1, Lic/b;->m:Lic/y;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "EnqueueRunnable_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ljc/o;->c:Lic/l;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Ljc/v;->d:Lsc/a;

    check-cast v0, Lsc/b;

    iget-object v0, v0, Lsc/b;->a:Landroidx/room/u1;

    new-instance v3, La6/l0;

    const/16 v4, 0x19

    invoke-direct {v3, p0, v4}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2, v0, v3}, Lwb3/f;->I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;

    move-result-object v0

    iput-object v0, p0, Ljc/o;->h:Lic/f0;

    goto :goto_0

    :cond_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Already enqueued work ids ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", "

    iget-object v3, p0, Ljc/o;->e:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljc/o;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Ljc/o;->h:Lic/f0;

    return-object v0
.end method
