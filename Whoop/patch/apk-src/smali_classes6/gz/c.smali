.class public final Lgz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La40/c;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "viewActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz/c;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ly00/i;)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcz/r;

    invoke-direct {v0, p1}, Lcz/r;-><init>(Ly00/i;)V

    iget-object p1, p0, Lgz/c;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
