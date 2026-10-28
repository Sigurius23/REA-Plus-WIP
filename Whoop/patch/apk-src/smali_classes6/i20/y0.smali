.class public final Li20/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li20/b0;

.field public b:Lj/d;

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Li20/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/y0;->a:Li20/b0;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Li20/y0;->c:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Lg/l;Lg/l;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;->a:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;

    new-instance v1, Laq0/o;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    iput-object p1, p0, Li20/y0;->b:Lj/d;

    invoke-interface {p2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance p2, Le10/q0;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v0}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method
