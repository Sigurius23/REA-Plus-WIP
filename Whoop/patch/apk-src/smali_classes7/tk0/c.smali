.class public final synthetic Ltk0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Ltd3/b;

.field public final synthetic x:Ltk0/b$b$a;


# direct methods
.method public synthetic constructor <init>(Ltd3/b;Ltk0/b$b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk0/c;->w:Ltd3/b;

    iput-object p2, p0, Ltk0/c;->x:Ltk0/b$b$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltk0/c;->w:Ltd3/b;

    iget-object v1, p0, Ltk0/c;->x:Ltk0/b$b$a;

    invoke-static {v0, v1}, Ltk0/b$b;->f(Ltd3/b;Ltk0/b$b$a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
