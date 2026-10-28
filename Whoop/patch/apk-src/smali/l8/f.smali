.class public final Ll8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll8/f;->a:Lj93/d;

    iput-object p2, p0, Ll8/f;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method
