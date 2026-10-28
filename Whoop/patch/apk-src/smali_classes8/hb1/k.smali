.class public final synthetic Lhb1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lld1/c;

.field public final synthetic x:Lhb1/n;


# direct methods
.method public synthetic constructor <init>(Lld1/c;Lhb1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb1/k;->w:Lld1/c;

    iput-object p2, p0, Lhb1/k;->x:Lhb1/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhb1/k;->w:Lld1/c;

    iget-object v1, p0, Lhb1/k;->x:Lhb1/n;

    invoke-static {v0, v1}, Lhb1/m;->g(Lld1/c;Lhb1/n;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
