.class public final synthetic Lug1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lug1/c;

.field public final synthetic x:Lug1/c$c$a;


# direct methods
.method public synthetic constructor <init>(Lug1/c;Lug1/c$c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug1/d;->w:Lug1/c;

    iput-object p2, p0, Lug1/d;->x:Lug1/c$c$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lug1/d;->w:Lug1/c;

    iget-object v1, p0, Lug1/d;->x:Lug1/c$c$a;

    invoke-static {v0, v1}, Lug1/c$c;->f(Lug1/c;Lug1/c$c$a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
