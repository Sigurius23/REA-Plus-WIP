.class public final synthetic Lgb1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ln0/u;

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ln0/u;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb1/p;->w:Ln0/u;

    iput-object p2, p0, Lgb1/p;->x:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgb1/p;->x:Lc93/a;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Lgb1/p;->w:Ln0/u;

    invoke-static {v1, v0, p1}, Lgb1/q;->b(Ln0/u;Lc93/a;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
