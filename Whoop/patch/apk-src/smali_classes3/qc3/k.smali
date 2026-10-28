.class public abstract Lqc3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsc3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsc3/u;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/h;->w:Lqc3/h;

    invoke-direct {v1, v2}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/4 v2, 0x0

    const/16 v3, 0x38

    const/16 v4, 0x1f

    invoke-direct {v0, v1, v4, v2, v3}, Lsc3/u;-><init>(Lsc3/r;ILqc3/l0;I)V

    sput-object v0, Lqc3/k;->a:Lsc3/u;

    sget-object v0, Lqc3/j;->w:Lqc3/j;

    invoke-interface {v0}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqc3/i;->w:Lqc3/i;

    invoke-interface {v0}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
