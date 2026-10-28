.class public final synthetic Lv6/f;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lv6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lv6/f;

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lv6/k;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lv6/f;->w:Lv6/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lv6/k;

    invoke-direct {v0}, Lv6/k;-><init>()V

    return-object v0
.end method
