.class public final Li20/p;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Li20/k1;

.field public final x:Lk83/a;

.field public final y:Lk83/a;


# direct methods
.method public constructor <init>(Li20/k1;Lp20/b;Lp20/b;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputAddressViewModelSubcomponentFactoryProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCompleteViewModelSubcomponentFactoryProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Li20/p;->w:Li20/k1;

    iput-object p2, p0, Li20/p;->x:Lk83/a;

    iput-object p3, p0, Li20/p;->y:Lk83/a;

    return-void
.end method
