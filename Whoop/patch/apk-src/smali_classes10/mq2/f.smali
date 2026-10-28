.class public final synthetic Lmq2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq2/f;->w:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmq2/f;->w:Lp1/c1;

    invoke-static {v0}, Lmq2/g$a$a;->f(Lp1/c1;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
