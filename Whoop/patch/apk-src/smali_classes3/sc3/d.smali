.class public final Lsc3/d;
.super Lsc3/f;
.source "SourceFile"


# instance fields
.field public final b:Ltc3/a;

.field public final c:Luc3/l;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "formats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lsc3/f;-><init>(Ljava/util/List;)V

    invoke-super {p0}, Lsc3/f;->a()Ltc3/a;

    move-result-object p1

    iput-object p1, p0, Lsc3/d;->b:Ltc3/a;

    invoke-super {p0}, Lsc3/f;->b()Luc3/l;

    move-result-object p1

    iput-object p1, p0, Lsc3/d;->c:Luc3/l;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 1

    iget-object v0, p0, Lsc3/d;->b:Ltc3/a;

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 1

    iget-object v0, p0, Lsc3/d;->c:Luc3/l;

    return-object v0
.end method
