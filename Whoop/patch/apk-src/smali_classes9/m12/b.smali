.class public final synthetic Lm12/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lld1/c;


# direct methods
.method public synthetic constructor <init>(Lld1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm12/b;->w:Lld1/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm12/b;->w:Lld1/c;

    invoke-static {v0}, Lm12/d;->g(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
