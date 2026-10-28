.class public final synthetic Lhj0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lhj0/d;

.field public final synthetic x:Lhj0/d$a$c;


# direct methods
.method public synthetic constructor <init>(Lhj0/d;Lhj0/d$a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhj0/c;->w:Lhj0/d;

    iput-object p2, p0, Lhj0/c;->x:Lhj0/d$a$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhj0/c;->w:Lhj0/d;

    iget-object v1, p0, Lhj0/c;->x:Lhj0/d$a$c;

    invoke-static {v0, v1}, Lhj0/d$a;->f(Lhj0/d;Lhj0/d$a$c;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
