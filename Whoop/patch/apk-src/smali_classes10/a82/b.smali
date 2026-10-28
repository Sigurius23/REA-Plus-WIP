.class public final synthetic La82/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:La82/c;


# direct methods
.method public synthetic constructor <init>(La82/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La82/b;->w:La82/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La82/b;->w:La82/c;

    invoke-static {v0}, La82/c$a;->f(La82/c;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
