.class public final Lgz/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La40/e;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "viewActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz/d;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lgz/d;->w:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcz/p;->a:Lcz/p;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
