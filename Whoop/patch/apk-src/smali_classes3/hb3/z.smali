.class public final Lhb3/z;
.super Lhb3/a0;
.source "SourceFile"


# instance fields
.field public final E:Lva3/e;


# direct methods
.method public constructor <init>(Lva3/e;Lsa3/f;Lsa3/h;Lr93/s0;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, Lhb3/a0;-><init>(Lsa3/f;Lsa3/h;Lr93/s0;)V

    iput-object p1, p0, Lhb3/z;->E:Lva3/e;

    return-void
.end method


# virtual methods
.method public final b()Lva3/e;
    .locals 1

    iget-object v0, p0, Lhb3/z;->E:Lva3/e;

    return-object v0
.end method
