.class public final synthetic Lx41/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Leu/g;


# direct methods
.method public synthetic constructor <init>(Leu/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx41/f;->w:Leu/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx41/f;->w:Leu/g;

    invoke-static {v0}, Lx41/g$a;->f(Leu/g;)Ll83/k;

    move-result-object v0

    return-object v0
.end method
