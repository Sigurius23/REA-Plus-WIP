.class public final Lj20/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyy/j;

.field public final b:Lyy/c;

.field public final c:Lq83/j;


# direct methods
.method public constructor <init>(Lyy/j;Lyy/c;Lq83/j;)V
    .locals 1

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj20/c;->a:Lyy/j;

    iput-object p2, p0, Lj20/c;->b:Lyy/c;

    iput-object p3, p0, Lj20/c;->c:Lq83/j;

    return-void
.end method
