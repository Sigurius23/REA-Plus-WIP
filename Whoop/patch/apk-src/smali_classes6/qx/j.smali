.class public final Lqx/j;
.super Ltx/f;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Class;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqx/j;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lqx/j;->b:Ljava/lang/Class;

    iput p3, p0, Lqx/j;->c:I

    return-void
.end method


# virtual methods
.method public final U()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lqx/j;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lqx/j;->b:Ljava/lang/Class;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lqx/j;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqx/j;->b:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
