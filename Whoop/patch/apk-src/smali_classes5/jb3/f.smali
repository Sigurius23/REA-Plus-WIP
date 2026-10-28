.class public final Ljb3/f;
.super Lya3/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb3/f;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final b(Lr93/c;)V
    .locals 1

    const-string v0, "fakeOverride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lya3/n;->r(Lr93/c;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Ljb3/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lr93/c;Lr93/c;)V
    .locals 1

    const-string v0, "fromCurrent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lu93/x;

    if-eqz v0, :cond_0

    check-cast p2, Lu93/x;

    sget-object v0, Lr93/s;->a:Lr93/s;

    invoke-virtual {p2, v0, p1}, Lu93/x;->Q0(Lr93/a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
