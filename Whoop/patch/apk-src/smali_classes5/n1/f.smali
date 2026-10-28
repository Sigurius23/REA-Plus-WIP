.class public final synthetic Ln1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/x;


# instance fields
.field public final synthetic w:Ln1/o;


# direct methods
.method public synthetic constructor <init>(Ln1/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/f;->w:Ln1/o;

    return-void
.end method


# virtual methods
.method public final invoke()F
    .locals 1

    iget-object v0, p0, Ln1/f;->w:Ln1/o;

    iget-object v0, v0, Ln1/o;->a:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method
