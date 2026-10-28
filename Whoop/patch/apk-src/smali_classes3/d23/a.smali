.class public final Ld23/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc/g;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld23/a;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ld23/a;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(IFI)V
    .locals 0

    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Ld23/a;->b:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Ld23/a;->a:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
