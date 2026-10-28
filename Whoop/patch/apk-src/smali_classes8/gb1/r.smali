.class public final synthetic Lgb1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Ln0/u;

.field public final synthetic x:Lkotlin/jvm/internal/b0;


# direct methods
.method public synthetic constructor <init>(Ln0/u;Lkotlin/jvm/internal/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb1/r;->w:Ln0/u;

    iput-object p2, p0, Lgb1/r;->x:Lkotlin/jvm/internal/b0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgb1/r;->w:Ln0/u;

    iget-object v1, p0, Lgb1/r;->x:Lkotlin/jvm/internal/b0;

    invoke-static {v0, v1}, Lgb1/q$b;->f(Ln0/u;Lkotlin/jvm/internal/b0;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
