.class public final Lgg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Lkotlin/jvm/internal/i;


# direct methods
.method public constructor <init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgg/a;->a:Lj93/d;

    check-cast p2, Lkotlin/jvm/internal/i;

    iput-object p2, p0, Lgg/a;->b:Lkotlin/jvm/internal/i;

    return-void
.end method
