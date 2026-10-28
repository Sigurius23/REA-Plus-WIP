.class public final synthetic Lbd1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lbd1/c;->w:Lkotlin/jvm/functions/Function1;

    iput-wide p1, p0, Lbd1/c;->x:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lbd1/c;->w:Lkotlin/jvm/functions/Function1;

    iget-wide v1, p0, Lbd1/c;->x:J

    invoke-static {v1, v2, v0}, Lbd1/e$a;->c(JLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
