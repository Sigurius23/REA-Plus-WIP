.class public final Lq93/b;
.super Lo93/h;
.source "SourceFile"


# static fields
.field public static final f:Lq93/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq93/b;

    new-instance v1, Lkb3/k;

    const-string v2, "FallbackBuiltIns"

    invoke-direct {v1, v2}, Lkb3/k;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lo93/h;-><init>(Lkb3/k;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo93/h;->c(Z)V

    sput-object v0, Lq93/b;->f:Lq93/b;

    return-void
.end method


# virtual methods
.method public final bridge synthetic q()Lt93/d;
    .locals 1

    sget-object v0, Lt93/a;->c:Lt93/a;

    return-object v0
.end method
