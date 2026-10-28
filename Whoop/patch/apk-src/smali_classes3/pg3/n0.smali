.class public final Lpg3/n0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/n0;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p1, Lpg3/s0;->e:Lud3/n0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lpg3/n0;->c:Ljava/lang/Class;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lud3/n0;->e:Lv63/c;

    invoke-virtual {v1, v0, p2}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object p2

    iput-object p2, p1, Lud3/n0;->e:Lv63/c;

    return-void
.end method
