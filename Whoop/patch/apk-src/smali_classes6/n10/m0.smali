.class public final Ln10/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/i0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ly00/n;

.field public final c:Lb9/m1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly00/n;Lyy/f;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientAttributionMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/m0;->a:Ljava/lang/String;

    iput-object p2, p0, Ln10/m0;->b:Ly00/n;

    new-instance p1, Lb9/m1;

    invoke-virtual {p3}, Lyy/f;->f()Z

    move-result p2

    const/4 p3, 0x3

    invoke-direct {p1, p2, p3}, Lb9/m1;-><init>(ZI)V

    iput-object p1, p0, Ln10/m0;->c:Lb9/m1;

    return-void
.end method


# virtual methods
.method public final a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v5, Llq0/d;

    const/16 p4, 0x13

    invoke-direct {v5, p4, p2, p0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Ln10/m0;->c:Lb9/m1;

    iget-object v1, p0, Ln10/m0;->a:Ljava/lang/String;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lb9/m1;->b(Ljava/lang/String;Ly00/c8;Ly00/p;ZLkotlin/jvm/functions/Function1;)Le10/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v5, Llq0/d;

    const/16 p4, 0x14

    invoke-direct {v5, p4, p2, p0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Ln10/m0;->c:Lb9/m1;

    iget-object v1, p0, Ln10/m0;->a:Ljava/lang/String;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lb9/m1;->b(Ljava/lang/String;Ly00/c8;Ly00/p;ZLkotlin/jvm/functions/Function1;)Le10/d;

    move-result-object p1

    return-object p1
.end method
