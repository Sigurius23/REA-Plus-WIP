.class public final synthetic Lzh1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lzh1/d;

.field public final synthetic x:Lzh1/d$a$b;


# direct methods
.method public synthetic constructor <init>(Lzh1/d;Lzh1/d$a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzh1/c;->w:Lzh1/d;

    iput-object p2, p0, Lzh1/c;->x:Lzh1/d$a$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzh1/c;->w:Lzh1/d;

    iget-object v1, p0, Lzh1/c;->x:Lzh1/d$a$b;

    invoke-static {v0, v1}, Lzh1/d$a;->h(Lzh1/d;Lzh1/d$a$b;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
