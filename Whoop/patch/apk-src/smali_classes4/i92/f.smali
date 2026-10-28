.class public final synthetic Li92/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Li92/g;

.field public final synthetic x:Li92/g$a$a;


# direct methods
.method public synthetic constructor <init>(Li92/g;Li92/g$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/f;->w:Li92/g;

    iput-object p2, p0, Li92/f;->x:Li92/g$a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li92/f;->w:Li92/g;

    iget-object v1, p0, Li92/f;->x:Li92/g$a$a;

    invoke-static {v0, v1}, Li92/g$a;->f(Li92/g;Li92/g$a$a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
